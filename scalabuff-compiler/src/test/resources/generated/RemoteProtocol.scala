// Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
// source: RemoteProtocol.proto

package resources.generated

final case class AkkaRemoteProtocol (
	`message`: Option[RemoteMessageProtocol] = None,
	`instruction`: Option[RemoteControlProtocol] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[AkkaRemoteProtocol]
	with net.sandrogrzicic.scalabuff.Parser[AkkaRemoteProtocol] {

	def setMessage(_f: RemoteMessageProtocol) = copy(`message` = Some(_f))
	def setInstruction(_f: RemoteControlProtocol) = copy(`instruction` = Some(_f))

	def clearMessage = copy(`message` = None)
	def clearInstruction = copy(`instruction` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		if (`message`.isDefined) output.writeMessage(1, `message`.get)
		if (`instruction`.isDefined) output.writeMessage(2, `instruction`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		if (`message`.isDefined) __size += computeMessageSize(1, `message`.get)
		if (`instruction`.isDefined) __size += computeMessageSize(2, `instruction`.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AkkaRemoteProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __message: Option[RemoteMessageProtocol] = `message`
		var __instruction: Option[RemoteControlProtocol] = `instruction`

		def __newMerged = AkkaRemoteProtocol(
			__message,
			__instruction
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __message = Some(readMessage[RemoteMessageProtocol](in, __message.orElse({
				__message = RemoteMessageProtocol.defaultInstance
				__message
			}).get, _emptyRegistry))
			case 18 => __instruction = Some(readMessage[RemoteControlProtocol](in, __instruction.orElse({
				__instruction = RemoteControlProtocol.defaultInstance
				__instruction
			}).get, _emptyRegistry))
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: AkkaRemoteProtocol) = {
		AkkaRemoteProtocol(
			m.`message`.orElse(`message`),
			m.`instruction`.orElse(`instruction`)
		)
	}

	def getDefaultInstanceForType = AkkaRemoteProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object AkkaRemoteProtocol {
	@reflect.BeanProperty val defaultInstance = new AkkaRemoteProtocol()

	def parseFrom(data: Array[Byte]): AkkaRemoteProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): AkkaRemoteProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): AkkaRemoteProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): AkkaRemoteProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[AkkaRemoteProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val MESSAGE_FIELD_NUMBER = 1
	val INSTRUCTION_FIELD_NUMBER = 2

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: AkkaRemoteProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class RemoteMessageProtocol (
	`recipient`: ActorRefProtocol = ActorRefProtocol.defaultInstance,
	`message`: MessageProtocol = MessageProtocol.defaultInstance,
	`sender`: Option[ActorRefProtocol] = None,
	`metadata`: collection.immutable.Seq[MetadataEntryProtocol] = Vector.empty[MetadataEntryProtocol]
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[RemoteMessageProtocol]
	with net.sandrogrzicic.scalabuff.Parser[RemoteMessageProtocol] {

	def setSender(_f: ActorRefProtocol) = copy(`sender` = Some(_f))
	def setMetadata(_i: Int, _v: MetadataEntryProtocol) = copy(`metadata` = `metadata`.updated(_i, _v))
	def addMetadata(_f: MetadataEntryProtocol) = copy(`metadata` = `metadata` :+ _f)
	def addAllMetadata(_f: MetadataEntryProtocol*) = copy(`metadata` = `metadata` ++ _f)
	def addAllMetadata(_f: TraversableOnce[MetadataEntryProtocol]) = copy(`metadata` = `metadata` ++ _f)

	def clearSender = copy(`sender` = None)
	def clearMetadata = copy(`metadata` = Vector.empty[MetadataEntryProtocol])

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `recipient`)
		output.writeMessage(2, `message`)
		if (`sender`.isDefined) output.writeMessage(4, `sender`.get)
		for (_v <- `metadata`) output.writeMessage(5, _v)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `recipient`)
		__size += computeMessageSize(2, `message`)
		if (`sender`.isDefined) __size += computeMessageSize(4, `sender`.get)
		for (_v <- `metadata`) __size += computeMessageSize(5, _v)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RemoteMessageProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __recipient: ActorRefProtocol = ActorRefProtocol.defaultInstance
		var __message: MessageProtocol = MessageProtocol.defaultInstance
		var __sender: Option[ActorRefProtocol] = `sender`
		val __metadata: collection.mutable.Buffer[MetadataEntryProtocol] = `metadata`.toBuffer

		def __newMerged = RemoteMessageProtocol(
			__recipient,
			__message,
			__sender,
			Vector(__metadata: _*)
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __recipient = readMessage[ActorRefProtocol](in, __recipient, _emptyRegistry)
			case 18 => __message = readMessage[MessageProtocol](in, __message, _emptyRegistry)
			case 34 => __sender = Some(readMessage[ActorRefProtocol](in, __sender.orElse({
				__sender = ActorRefProtocol.defaultInstance
				__sender
			}).get, _emptyRegistry))
			case 42 => __metadata += readMessage[MetadataEntryProtocol](in, MetadataEntryProtocol.defaultInstance, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: RemoteMessageProtocol) = {
		RemoteMessageProtocol(
			m.`recipient`,
			m.`message`,
			m.`sender`.orElse(`sender`),
			`metadata` ++ m.`metadata`
		)
	}

	def getDefaultInstanceForType = RemoteMessageProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object RemoteMessageProtocol {
	@reflect.BeanProperty val defaultInstance = new RemoteMessageProtocol()

	def parseFrom(data: Array[Byte]): RemoteMessageProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): RemoteMessageProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): RemoteMessageProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): RemoteMessageProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[RemoteMessageProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val RECIPIENT_FIELD_NUMBER = 1
	val MESSAGE_FIELD_NUMBER = 2
	val SENDER_FIELD_NUMBER = 4
	val METADATA_FIELD_NUMBER = 5

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: RemoteMessageProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class RemoteControlProtocol (
	`commandType`: CommandType.EnumVal = CommandType._UNINITIALIZED,
	`cookie`: Option[String] = None,
	`origin`: Option[AddressProtocol] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[RemoteControlProtocol]
	with net.sandrogrzicic.scalabuff.Parser[RemoteControlProtocol] {

	def setCookie(_f: String) = copy(`cookie` = Some(_f))
	def setOrigin(_f: AddressProtocol) = copy(`origin` = Some(_f))

	def clearCookie = copy(`cookie` = None)
	def clearOrigin = copy(`origin` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeEnum(1, `commandType`)
		if (`cookie`.isDefined) output.writeString(2, `cookie`.get)
		if (`origin`.isDefined) output.writeMessage(3, `origin`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeEnumSize(1, `commandType`)
		if (`cookie`.isDefined) __size += computeStringSize(2, `cookie`.get)
		if (`origin`.isDefined) __size += computeMessageSize(3, `origin`.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): RemoteControlProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __commandType: CommandType.EnumVal = CommandType._UNINITIALIZED
		var __cookie: Option[String] = `cookie`
		var __origin: Option[AddressProtocol] = `origin`

		def __newMerged = RemoteControlProtocol(
			__commandType,
			__cookie,
			__origin
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 8 => __commandType = CommandType.valueOf(in.readEnum())
			case 18 => __cookie = Some(in.readString())
			case 26 => __origin = Some(readMessage[AddressProtocol](in, __origin.orElse({
				__origin = AddressProtocol.defaultInstance
				__origin
			}).get, _emptyRegistry))
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: RemoteControlProtocol) = {
		RemoteControlProtocol(
			m.`commandType`,
			m.`cookie`.orElse(`cookie`),
			m.`origin`.orElse(`origin`)
		)
	}

	def getDefaultInstanceForType = RemoteControlProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object RemoteControlProtocol {
	@reflect.BeanProperty val defaultInstance = new RemoteControlProtocol()

	def parseFrom(data: Array[Byte]): RemoteControlProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): RemoteControlProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): RemoteControlProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): RemoteControlProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[RemoteControlProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val COMMANDTYPE_FIELD_NUMBER = 1
	val COOKIE_FIELD_NUMBER = 2
	val ORIGIN_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: RemoteControlProtocol) = defaultInstance.mergeFrom(prototype)

}
object CommandType extends net.sandrogrzicic.scalabuff.Enum {
	sealed trait EnumVal extends Value
	val _UNINITIALIZED = new EnumVal { val name = "UNINITIALIZED ENUM VALUE"; val id = -1 }

	val CONNECT = new EnumVal { val name = "CONNECT"; val id = 1 }
	val SHUTDOWN = new EnumVal { val name = "SHUTDOWN"; val id = 2 }
	val HEARTBEAT = new EnumVal { val name = "HEARTBEAT"; val id = 3 }

	val CONNECT_VALUE = 1
	val SHUTDOWN_VALUE = 2
	val HEARTBEAT_VALUE = 3

	def valueOf(id: Int) = id match {
		case 1 => CONNECT
		case 2 => SHUTDOWN
		case 3 => HEARTBEAT
		case _default => throw new net.sandrogrzicic.scalabuff.UnknownEnumException(_default)
	}
	val internalGetValueMap = new com.google.protobuf.Internal.EnumLiteMap[EnumVal] {
		def findValueByNumber(id: Int): EnumVal = valueOf(id)
	}
}
final case class ActorRefProtocol (
	`path`: String = ""
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[ActorRefProtocol]
	with net.sandrogrzicic.scalabuff.Parser[ActorRefProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `path`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `path`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): ActorRefProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __path: String = ""

		def __newMerged = ActorRefProtocol(
			__path
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __path = in.readString()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: ActorRefProtocol) = {
		ActorRefProtocol(
			m.`path`
		)
	}

	def getDefaultInstanceForType = ActorRefProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object ActorRefProtocol {
	@reflect.BeanProperty val defaultInstance = new ActorRefProtocol()

	def parseFrom(data: Array[Byte]): ActorRefProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): ActorRefProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): ActorRefProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): ActorRefProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[ActorRefProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val PATH_FIELD_NUMBER = 1

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: ActorRefProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class MessageProtocol (
	`message`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY,
	`serializerId`: Int = 0,
	`messageManifest`: Option[com.google.protobuf.ByteString] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[MessageProtocol]
	with net.sandrogrzicic.scalabuff.Parser[MessageProtocol] {

	def setMessageManifest(_f: com.google.protobuf.ByteString) = copy(`messageManifest` = Some(_f))

	def clearMessageManifest = copy(`messageManifest` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeBytes(1, `message`)
		output.writeInt32(2, `serializerId`)
		if (`messageManifest`.isDefined) output.writeBytes(3, `messageManifest`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeBytesSize(1, `message`)
		__size += computeInt32Size(2, `serializerId`)
		if (`messageManifest`.isDefined) __size += computeBytesSize(3, `messageManifest`.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): MessageProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __message: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
		var __serializerId: Int = 0
		var __messageManifest: Option[com.google.protobuf.ByteString] = `messageManifest`

		def __newMerged = MessageProtocol(
			__message,
			__serializerId,
			__messageManifest
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __message = in.readBytes()
			case 16 => __serializerId = in.readInt32()
			case 26 => __messageManifest = Some(in.readBytes())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: MessageProtocol) = {
		MessageProtocol(
			m.`message`,
			m.`serializerId`,
			m.`messageManifest`.orElse(`messageManifest`)
		)
	}

	def getDefaultInstanceForType = MessageProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object MessageProtocol {
	@reflect.BeanProperty val defaultInstance = new MessageProtocol()

	def parseFrom(data: Array[Byte]): MessageProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): MessageProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): MessageProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): MessageProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[MessageProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val MESSAGE_FIELD_NUMBER = 1
	val SERIALIZERID_FIELD_NUMBER = 2
	val MESSAGEMANIFEST_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: MessageProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class MetadataEntryProtocol (
	`key`: String = "",
	`value`: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[MetadataEntryProtocol]
	with net.sandrogrzicic.scalabuff.Parser[MetadataEntryProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `key`)
		output.writeBytes(2, `value`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `key`)
		__size += computeBytesSize(2, `value`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): MetadataEntryProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __key: String = ""
		var __value: com.google.protobuf.ByteString = com.google.protobuf.ByteString.EMPTY

		def __newMerged = MetadataEntryProtocol(
			__key,
			__value
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __key = in.readString()
			case 18 => __value = in.readBytes()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: MetadataEntryProtocol) = {
		MetadataEntryProtocol(
			m.`key`,
			m.`value`
		)
	}

	def getDefaultInstanceForType = MetadataEntryProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object MetadataEntryProtocol {
	@reflect.BeanProperty val defaultInstance = new MetadataEntryProtocol()

	def parseFrom(data: Array[Byte]): MetadataEntryProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): MetadataEntryProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): MetadataEntryProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): MetadataEntryProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[MetadataEntryProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val KEY_FIELD_NUMBER = 1
	val VALUE_FIELD_NUMBER = 2

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: MetadataEntryProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class AddressProtocol (
	`system`: String = "",
	`hostname`: String = "",
	`port`: Int = 0
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[AddressProtocol]
	with net.sandrogrzicic.scalabuff.Parser[AddressProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `system`)
		output.writeString(2, `hostname`)
		output.writeUInt32(3, `port`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `system`)
		__size += computeStringSize(2, `hostname`)
		__size += computeUInt32Size(3, `port`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): AddressProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __system: String = ""
		var __hostname: String = ""
		var __port: Int = 0

		def __newMerged = AddressProtocol(
			__system,
			__hostname,
			__port
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __system = in.readString()
			case 18 => __hostname = in.readString()
			case 24 => __port = in.readUInt32()
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: AddressProtocol) = {
		AddressProtocol(
			m.`system`,
			m.`hostname`,
			m.`port`
		)
	}

	def getDefaultInstanceForType = AddressProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object AddressProtocol {
	@reflect.BeanProperty val defaultInstance = new AddressProtocol()

	def parseFrom(data: Array[Byte]): AddressProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): AddressProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): AddressProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): AddressProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[AddressProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val SYSTEM_FIELD_NUMBER = 1
	val HOSTNAME_FIELD_NUMBER = 2
	val PORT_FIELD_NUMBER = 3

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: AddressProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class DaemonMsgCreateProtocol (
	`props`: PropsProtocol = PropsProtocol.defaultInstance,
	`deploy`: DeployProtocol = DeployProtocol.defaultInstance,
	`path`: String = "",
	`supervisor`: ActorRefProtocol = ActorRefProtocol.defaultInstance
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[DaemonMsgCreateProtocol]
	with net.sandrogrzicic.scalabuff.Parser[DaemonMsgCreateProtocol] {



	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeMessage(1, `props`)
		output.writeMessage(2, `deploy`)
		output.writeString(3, `path`)
		output.writeMessage(4, `supervisor`)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeMessageSize(1, `props`)
		__size += computeMessageSize(2, `deploy`)
		__size += computeStringSize(3, `path`)
		__size += computeMessageSize(4, `supervisor`)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): DaemonMsgCreateProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __props: PropsProtocol = PropsProtocol.defaultInstance
		var __deploy: DeployProtocol = DeployProtocol.defaultInstance
		var __path: String = ""
		var __supervisor: ActorRefProtocol = ActorRefProtocol.defaultInstance

		def __newMerged = DaemonMsgCreateProtocol(
			__props,
			__deploy,
			__path,
			__supervisor
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __props = readMessage[PropsProtocol](in, __props, _emptyRegistry)
			case 18 => __deploy = readMessage[DeployProtocol](in, __deploy, _emptyRegistry)
			case 26 => __path = in.readString()
			case 34 => __supervisor = readMessage[ActorRefProtocol](in, __supervisor, _emptyRegistry)
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: DaemonMsgCreateProtocol) = {
		DaemonMsgCreateProtocol(
			m.`props`,
			m.`deploy`,
			m.`path`,
			m.`supervisor`
		)
	}

	def getDefaultInstanceForType = DaemonMsgCreateProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object DaemonMsgCreateProtocol {
	@reflect.BeanProperty val defaultInstance = new DaemonMsgCreateProtocol()

	def parseFrom(data: Array[Byte]): DaemonMsgCreateProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): DaemonMsgCreateProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): DaemonMsgCreateProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): DaemonMsgCreateProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[DaemonMsgCreateProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val PROPS_FIELD_NUMBER = 1
	val DEPLOY_FIELD_NUMBER = 2
	val PATH_FIELD_NUMBER = 3
	val SUPERVISOR_FIELD_NUMBER = 4

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: DaemonMsgCreateProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class PropsProtocol (
	`dispatcher`: String = "",
	`deploy`: DeployProtocol = DeployProtocol.defaultInstance,
	`fromClassCreator`: Option[String] = None,
	`creator`: Option[com.google.protobuf.ByteString] = None,
	`routerConfig`: Option[com.google.protobuf.ByteString] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[PropsProtocol]
	with net.sandrogrzicic.scalabuff.Parser[PropsProtocol] {

	def setFromClassCreator(_f: String) = copy(`fromClassCreator` = Some(_f))
	def setCreator(_f: com.google.protobuf.ByteString) = copy(`creator` = Some(_f))
	def setRouterConfig(_f: com.google.protobuf.ByteString) = copy(`routerConfig` = Some(_f))

	def clearFromClassCreator = copy(`fromClassCreator` = None)
	def clearCreator = copy(`creator` = None)
	def clearRouterConfig = copy(`routerConfig` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `dispatcher`)
		output.writeMessage(2, `deploy`)
		if (`fromClassCreator`.isDefined) output.writeString(3, `fromClassCreator`.get)
		if (`creator`.isDefined) output.writeBytes(4, `creator`.get)
		if (`routerConfig`.isDefined) output.writeBytes(5, `routerConfig`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `dispatcher`)
		__size += computeMessageSize(2, `deploy`)
		if (`fromClassCreator`.isDefined) __size += computeStringSize(3, `fromClassCreator`.get)
		if (`creator`.isDefined) __size += computeBytesSize(4, `creator`.get)
		if (`routerConfig`.isDefined) __size += computeBytesSize(5, `routerConfig`.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): PropsProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __dispatcher: String = ""
		var __deploy: DeployProtocol = DeployProtocol.defaultInstance
		var __fromClassCreator: Option[String] = `fromClassCreator`
		var __creator: Option[com.google.protobuf.ByteString] = `creator`
		var __routerConfig: Option[com.google.protobuf.ByteString] = `routerConfig`

		def __newMerged = PropsProtocol(
			__dispatcher,
			__deploy,
			__fromClassCreator,
			__creator,
			__routerConfig
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __dispatcher = in.readString()
			case 18 => __deploy = readMessage[DeployProtocol](in, __deploy, _emptyRegistry)
			case 26 => __fromClassCreator = Some(in.readString())
			case 34 => __creator = Some(in.readBytes())
			case 42 => __routerConfig = Some(in.readBytes())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: PropsProtocol) = {
		PropsProtocol(
			m.`dispatcher`,
			m.`deploy`,
			m.`fromClassCreator`.orElse(`fromClassCreator`),
			m.`creator`.orElse(`creator`),
			m.`routerConfig`.orElse(`routerConfig`)
		)
	}

	def getDefaultInstanceForType = PropsProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object PropsProtocol {
	@reflect.BeanProperty val defaultInstance = new PropsProtocol()

	def parseFrom(data: Array[Byte]): PropsProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): PropsProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): PropsProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): PropsProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[PropsProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val DISPATCHER_FIELD_NUMBER = 1
	val DEPLOY_FIELD_NUMBER = 2
	val FROMCLASSCREATOR_FIELD_NUMBER = 3
	val CREATOR_FIELD_NUMBER = 4
	val ROUTERCONFIG_FIELD_NUMBER = 5

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: PropsProtocol) = defaultInstance.mergeFrom(prototype)

}
final case class DeployProtocol (
	`path`: String = "",
	`config`: Option[com.google.protobuf.ByteString] = None,
	`routerConfig`: Option[com.google.protobuf.ByteString] = None,
	`scope`: Option[com.google.protobuf.ByteString] = None
) extends com.google.protobuf.GeneratedMessageLite
	with com.google.protobuf.MessageLite.Builder
	with net.sandrogrzicic.scalabuff.Message[DeployProtocol]
	with net.sandrogrzicic.scalabuff.Parser[DeployProtocol] {

	def setConfig(_f: com.google.protobuf.ByteString) = copy(`config` = Some(_f))
	def setRouterConfig(_f: com.google.protobuf.ByteString) = copy(`routerConfig` = Some(_f))
	def setScope(_f: com.google.protobuf.ByteString) = copy(`scope` = Some(_f))

	def clearConfig = copy(`config` = None)
	def clearRouterConfig = copy(`routerConfig` = None)
	def clearScope = copy(`scope` = None)

	def writeTo(output: com.google.protobuf.CodedOutputStream) {
		output.writeString(1, `path`)
		if (`config`.isDefined) output.writeBytes(2, `config`.get)
		if (`routerConfig`.isDefined) output.writeBytes(3, `routerConfig`.get)
		if (`scope`.isDefined) output.writeBytes(4, `scope`.get)
	}

	lazy val getSerializedSize = {
		import com.google.protobuf.CodedOutputStream._
		var __size = 0
		__size += computeStringSize(1, `path`)
		if (`config`.isDefined) __size += computeBytesSize(2, `config`.get)
		if (`routerConfig`.isDefined) __size += computeBytesSize(3, `routerConfig`.get)
		if (`scope`.isDefined) __size += computeBytesSize(4, `scope`.get)

		__size
	}

	def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): DeployProtocol = {
		import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
		var __path: String = ""
		var __config: Option[com.google.protobuf.ByteString] = `config`
		var __routerConfig: Option[com.google.protobuf.ByteString] = `routerConfig`
		var __scope: Option[com.google.protobuf.ByteString] = `scope`

		def __newMerged = DeployProtocol(
			__path,
			__config,
			__routerConfig,
			__scope
		)
		while (true) in.readTag match {
			case 0 => return __newMerged
			case 10 => __path = in.readString()
			case 18 => __config = Some(in.readBytes())
			case 26 => __routerConfig = Some(in.readBytes())
			case 34 => __scope = Some(in.readBytes())
			case default => if (!in.skipField(default)) return __newMerged
		}
		null
	}

	def mergeFrom(m: DeployProtocol) = {
		DeployProtocol(
			m.`path`,
			m.`config`.orElse(`config`),
			m.`routerConfig`.orElse(`routerConfig`),
			m.`scope`.orElse(`scope`)
		)
	}

	def getDefaultInstanceForType = DeployProtocol.defaultInstance
	def clear = getDefaultInstanceForType
	def isInitialized = true
	def build = this
	def buildPartial = this
	def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
	override def getParserForType = this
	def newBuilderForType = getDefaultInstanceForType
	def toBuilder = this
}

object DeployProtocol {
	@reflect.BeanProperty val defaultInstance = new DeployProtocol()

	def parseFrom(data: Array[Byte]): DeployProtocol = defaultInstance.mergeFrom(data)
	def parseFrom(data: Array[Byte], offset: Int, length: Int): DeployProtocol = defaultInstance.mergeFrom(data, offset, length)
	def parseFrom(byteString: com.google.protobuf.ByteString): DeployProtocol = defaultInstance.mergeFrom(byteString)
	def parseFrom(stream: java.io.InputStream): DeployProtocol = defaultInstance.mergeFrom(stream)
	def parseDelimitedFrom(stream: java.io.InputStream): Option[DeployProtocol] = defaultInstance.mergeDelimitedFromStream(stream)

	val PATH_FIELD_NUMBER = 1
	val CONFIG_FIELD_NUMBER = 2
	val ROUTERCONFIG_FIELD_NUMBER = 3
	val SCOPE_FIELD_NUMBER = 4

	def newBuilder = defaultInstance.newBuilderForType
	def newBuilder(prototype: DeployProtocol) = defaultInstance.mergeFrom(prototype)

}

object RemoteProtocol {
	def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
	}

}
